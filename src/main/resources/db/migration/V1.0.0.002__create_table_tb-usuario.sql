create table if not exists tb_usuario (
    codigo int not null auto_increment,
    id_pessoa varchar(300) not null,
    identificador varchar(100) not null unique,
    chave_acesso varchar(100) not null,
    codigo_alteracao_recuperacao_chave_acesso varchar(100) null unique,
    primary key (codigo)
);