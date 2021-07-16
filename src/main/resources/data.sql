/*create table person
(
   id integer not null,
   name varchar(255) not null,
   location varchar (255),
  birth_date timestamp,
  primary key (id)
  );
*/
insert into person (ID, NAME, LOCATION, BIRTH_DATE)
values (10001, 'Nitesh', 'BLR', sysdate());
insert into person (ID, NAME, LOCATION, BIRTH_DATE)
values (10002, 'Ranjan', 'BGP', sysdate());
insert into person (ID, NAME, LOCATION, BIRTH_DATE)
values (10003, 'Shilpi', 'NOIDA', sysdate());