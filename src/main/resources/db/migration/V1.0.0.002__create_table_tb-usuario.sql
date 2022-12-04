create table if not exists tb_usuario (
    codigo int not null auto_increment,
    id_pessoa varchar(300) not null,
    identificador varchar(100) not null unique,
    chave_acesso varchar(100) not null,
    primary key (codigo)
);