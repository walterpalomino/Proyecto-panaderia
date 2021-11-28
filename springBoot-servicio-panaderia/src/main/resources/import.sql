insert into clientes(nombre) values('pepe');
insert into clientes(nombre) values('juan');
insert into clientes(nombre) values('pepito');

insert into producto(nombre, precio, stock_minimo, stock_maximo, stock_actual) values('criollo comun', 15.20, 5, 30, 20);
insert into producto(nombre, precio, stock_minimo, stock_maximo, stock_actual) values('pan tira', 15.20, 5, 30, 20);
insert into producto(nombre, precio, stock_minimo, stock_maximo, stock_actual) values('pan bollito', 15.20, 5, 30, 20);
insert into producto(nombre, precio, stock_minimo, stock_maximo, stock_actual) values('criollo hojaldre', 15.20, 5, 30, 20);
insert into producto(nombre, precio, stock_minimo, stock_maximo, stock_actual) values('chipaca', 15.20, 5, 30, 20);

insert into pedidos(cliente, importe_total, fecha) values(1, 15.30, '24/11/2021');
insert into pedidos(cliente, importe_total, fecha) values(2, 15.30, '24/11/2021');
insert into pedidos(cliente, importe_total, fecha) values(3, 15.30, '24/11/2021');
insert into pedidos(cliente, importe_total, fecha) values(1, 15.30, '24/11/2021');
insert into pedidos(cliente, importe_total, fecha) values(2, 15.30, '24/11/2021');

insert into detalle_pedido(producto,cantidad,pedido) values(1,'1 1/2',1);
insert into detalle_pedido(producto,cantidad,pedido) values(2,'1',1);
insert into detalle_pedido(producto,cantidad,pedido) values(3,'2 1/2',2);
insert into detalle_pedido(producto,cantidad,pedido) values(4,'1/2',3);
insert into detalle_pedido(producto,cantidad,pedido) values(5,'1 1/4',3);




