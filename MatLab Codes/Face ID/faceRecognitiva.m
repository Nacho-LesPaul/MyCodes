%leer la base  de datos de caras
clear all
close all
clc
C=[];
Ct=[];
figure(1)
%mask=[30:70,20:70];
%leer caras 1 a 9
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
    Ct=[Ct, Ik(:)];
    subplot(2,5,k)
    imshow(Ik);
end
%leer la cara a proyectar
In=imread('Cara19.pgm');
figure(2)
imshow(In)
% Inc=In(mask);
% b=double(Inc(:));
b=double(In(:));
C=double(C);
Ct=double(Ct);
a=inv(C'*C)*C'*b(:);
% a=C/B(:);
% individuo proyectado
p=round(Ct*a);
Ip=reshape(p,size(In));
figure(3)
imshow(uint8(Ip))
