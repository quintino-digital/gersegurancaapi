create database dbd_seguranca;

drop table if exists flyway_schema_history cascade;
drop table if exists tb_papel cascade;
drop table if exists tb_usuario cascade;
drop table if exists tb_usuario_papel cascade;

create table if not exists tb_papel_usuario (
    codigo int not null auto_increment,
    nome varchar(100) not null unique,
    descricao varchar(100) not null unique,
    primary key (codigo)
);

create table if not exists tb_usuario (
    codigo int not null auto_increment,
    id_pessoa varchar(300) not null,
    identificador varchar(100) not null unique,
    chave_acesso varchar(100) not null,
    primary key (codigo)
);

create table if not exists tb_usuario_papel (
    codigo int auto_increment primary key,
    id_usuario integer not null,
    id_papel integer not null,
    foreign key (id_usuario) references tb_usuario(codigo),
    foreign key (id_papel) references tb_papel(codigo)
);