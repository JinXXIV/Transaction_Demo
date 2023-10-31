
insert into TRANSACTION values ('FPX');
insert into TRANSACTION values ('Third party Transfer');

insert into allow_value values ('FPX', 2000);
insert into allow_value values ('FPX', 3000);
insert into allow_value values ('Third party Transfer', 5000);

insert into user_transaction values ('ABC', 'FPX', 1, 1000);
insert into user_transaction values ('ABC', 'Third party Transfer', 50, 3000);