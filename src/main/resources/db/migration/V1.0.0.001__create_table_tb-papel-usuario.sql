create table if not exists tb_papel_usuario (
    codigo int not null auto_increment,
    nome varchar(100) not null unique,
    descricao varchar(100) not null unique,
    primary key (codigo)
);