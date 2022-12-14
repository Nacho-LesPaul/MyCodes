clear all
close all
clc
% generacion de datos sintéticos
x0=-50;
v0=100;
g=-9.81;
t=[1:0.5:10];
x=x0+v0*t-0.5*g*t.^2;
noise=0.05;
mu0=0.8;
hn=noise*mean(x)*randn(1,length(x))+mu0;
xr=x+hn;
plot(t,xr,'k-o')
xlabel('t(s)')
ylabel('x(m)')
hold on
grid on
% ajuste por minimos cuadrados
ndata=length(xr);
t2=0.5*t.^2;
A=[t2(:),t(:),ones(ndata,1)];
param=inv(A'*A)*A'*xr(:);
x0p=param(3);
v0p=param(2);
gp=param(1);
%prediccion de la caida
tn=t(end);
xn=xr(end);
step=0.5;
while xn >0
    tn=tn+step;
    xn=x0p+v0p*tn-0.5*gp*tn^2;
    plot (tn,xn,'m.');
    pause(0.1)
end

