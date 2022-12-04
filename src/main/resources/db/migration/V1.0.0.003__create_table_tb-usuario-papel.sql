create table if not exists tb_usuario_papel (
    codigo int auto_increment primary key,
    id_usuario integer not null,
    id_papel integer not null,
    data_cadastro date not null,
    data_desativacao date null,
    foreign key (id_usuario) references tb_usuario(codigo),
    foreign key (id_papel) references tb_papel(codigo)
);