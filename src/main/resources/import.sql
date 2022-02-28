insert into prestamos(cliente,id,fecha,monto,estado)values('00103228',1, '2021-01-10', 37500.00, 'pendiente');
insert into prestamos(cliente,id,fecha,monto,estado)values('00103228',2, '2021-01-19', 725.18, 'pendiente');
insert into prestamos(cliente,id,fecha,monto,estado)values('00103228',3, '2021-01-31', 1578.22, 'pendiente');
insert into prestamos(cliente,id,fecha,monto,estado)values('00103228',4, '2021-02-04', 380.00, 'pendiente');

--insert into prestamos(cliente,id,fecha,monto,estado)values('00103228',3, '2021-01-31', 1,578.22, 'Pendiente');
--insert into prestamos(cliente,id,fecha,monto,estado)values('00103228',3, '2021-01-31', 1,578.22, 'Pendiente');
--insert into prestamos(cliente,id,fecha,monto,estado)values('00103228',3, '2021-01-31', 1,578.22, 'Pendiente');


INSERT INTO cuentas_debito(id, id_cliente, monto, estado)VALUES(1, 00103228, 15375.28, 'activa');
INSERT INTO cuentas_debito(id, id_cliente, monto, estado)VALUES(2, 70099925, 3728.51, 'bloqueada');