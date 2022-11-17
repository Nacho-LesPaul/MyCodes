%leer la base  de datos de caras.∫
clear all
close all
clc
C=[];
Ct=[];
figure(1)
%generar matriz c que contiene a las caras como columnas
for k=1:10
    if k<10
        namek=['Cara0' num2str(k) '.pgm'];
    else
        namek=['Cara' num2str(k) '.pgm'];
    end
    Ik=imread(namek);
    %cell-array
    Ic{k}=Ik;
    %Ikc=Ik(mask);
    Ikc=Ik;
    C=[C, Ikc(:)];
    subplot(2,5,k)
    imshow(Ik);
end
%matriz X de PCA (muestras por filas)
X=double(C');
meanX=mean(X);
Mx=repmat(meanX,size(X,1),1);
Xc=X-Mx;
figure
imagesc(Xc)
B=Xc'*Xc;
[P,D]=eig(B);
espectro=diag(D);
ncaras=size(X,1);
rango=ncaras-1;
espectroN=espectro(end:-1:end-rango+1);
figure
plot(espectroN,'o')
for k=1:ncaras
    pca{k}=P(:,end-k+1);
    subplot(2,5,k)
    pcak=reshape(pca{k}, size(Ic{1}));
    imagesc(pcak)
end
v1=pca{1};
v2=pca{2};
V=[v1(:) v2(:)];
coor=Xc*V;
figure
plot(coor(:,1),coor(:,2),'o');
hold on
for k=1:10
    text(coor(k,1)+0.001,coor(k,2)+0.001,num2str(k));
end
idx=kmeans(coor,2);
c1=find(idx==1);
c2=find(idx==2);
plot(coor(c1,1),coor(c1,2),'r*');
plot(coor(c2,1),coor(c2,2),'mo');
