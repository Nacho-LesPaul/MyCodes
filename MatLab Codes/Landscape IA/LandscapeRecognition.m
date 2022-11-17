%Ignacio Garcia Rodriguez
%Practica final Algebra Laboratorio

clear all
close all
clc

C=[];
Ct=[];
figure(1)
mask=[100:200,100:200];
for k=1:16
    namek=['paisaje' num2str(k) '.jpg'];
    %Ik=rgb2gray(imread(namek)) para leerlas en blanco y negro;
    Ik=imread(namek);
    %cell-array
    Ic{k}=Ik;
    Ikc=Ik(mask);
    C=[C, Ik(:)];
    Ct=[Ct,Ikc(:)];
    Ict{k}=Ik(mask)
    subplot(4,4,k)
    imshow(Ik);
end

%Minimos cuadrados
Ir1=imread('paisaje1.jpg');
b=double(Ir1(:));
C=double(C);
mc=inv(C'*C)*C'*b(:);

%matriz X de PCA (muestras por filas)
X=double(Ct');
meanX=mean(X);
Mx=repmat(meanX,size(X,1),1);
Xc=X-Mx;
figure
imagesc(Xc)

%Diagonalizacion
B=Xc'*Xc;
[P,D]=eig(B);
espectro=diag(D);
npaisajes=size(X,1);
rango=npaisajes-1;
espectroN=espectro(end:-1:end-rango+1);
figure
plot(espectroN,'o')
for k=1:npaisajes
    pca{k}=P(:,end-k+1);
    subplot(4,4,k)
    pcak=reshape(pca{k}, size(Ict{1}));
    imagesc(pcak)
end
v1=pca{1};
v2=pca{2};
V=[v1(:) v2(:)];
coor=Xc*V;
figure
plot(coor(:,1),coor(:,2),'o');
hold on

%Agrupamiento y representacion
for k=1:16
    text(coor(k,1)+0.001,coor(k,2)+0.001,num2str(k));
end
idx=kmeans(coor,4);
c1=find(idx==1);
c2=find(idx==2);
c3=find(idx==3);
c4=find(idx==4);
plot(coor(c1,1),coor(c1,2),'r*');
plot(coor(c2,1),coor(c2,2),'y*');
plot(coor(c3,1),coor(c3,2),'b*');
plot(coor(c4,1),coor(c4,2),'m*');

%Seleccion aleatoria de paisaje y clasificacion por medio del metodo anterior
r=round(15*rand+1)

%No consegui hacer que funcionase. Intente sacarlo de la representacion
%anterior para clasificarla, pero no encontre ningun metodo
%para ello. Tambien intente con clear all y analizandola de cero paso a
%paso como el metodo anterior, pero me dio un error en una opercaion matricial
%que no fui capaz de arreglar.