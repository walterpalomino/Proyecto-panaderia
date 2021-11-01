insert into clientes(nombre) values('pepe');
insert into clientes(nombre) values('juan');
insert into clientes(nombre) values('pepito');

insert into producto(nombre) values('criollo comun');
insert into producto(nombre) values('pan tira');
insert into producto(nombre) values('pan bollito');
insert into producto(nombre) values('criollo hojaldre');
insert into producto(nombre) values('chipaca');

insert into pedidos(cliente) values(1);
insert into pedidos(cliente) values(2);
insert into pedidos(cliente) values(3);
insert into pedidos(cliente) values(1);
insert into pedidos(cliente) values(2);

insert into detalle_pedido(producto,cantidad,pedido) values(1,'1 1/2',1);
insert into detalle_pedido(producto,cantidad,pedido) values(2,'1',1);
insert into detalle_pedido(producto,cantidad,pedido) values(3,'2 1/2',2);
insert into detalle_pedido(producto,cantidad,pedido) values(4,'1/2',3);
insert into detalle_pedido(producto,cantidad,pedido) values(5,'1 1/4',3);




