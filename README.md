# Helpdesk

Será criada uma área administrativa para visualização das métricas do helpdesk

## Administração de usuário

  Neste projeto prático você vai aprender a trabalhar com `SpringBoot` na prática criando um sistema Helpdesk 
(Atendimento de chamados) trabalhando com as principais ferramentas do ecossistema Spring: 
`SpringBoot` para nos dar suporte na área `CDI` e `IOC`, `Spring Security` para trabalharmos 
com autenticação/autorização e segurança da nossa aplicação (`XSS`, `CSRF`), Spring Data para 
trabalharmos com os nosso dados de forma simplificada e abstrata sem precisar interagir diretamente 
com o banco de dados, Spring Devtools para criarmos um ambiente rápido de desenvolvimento 
trabalhando com `hotswap` além do `Thymeleaf` para criarmos layouts dinâmicos para 
receber dados do nosso servidor. Tudo isso com a ajuda do framework frontend mais conhecido do mercado, o 
`Bootstrap 4`.
  Será criada uma área administrativa para visualização das métricas do helpdesk, a área gerencial
onde será possivel administrar usuários e chamados; também será criada a de usuários onde eles poderão abrir,
listar e interagir com os mesmos podendo também comentar, avaliar, enviar seus dados para o suporte e também 
fazer a geração de relatórios utilizando filtros.

Será criada uma área administrativa para visualização das métricas do helpdesk. 
* Administrar usuários e chamados; 
* Também será criada a de usuários onde eles poderão abrir, listar e interagir com os 
mesmos podendo também comentar, avaliar, enviar seus dados para o suporte.
* Fazer a geração de relatórios utilizando filtros.


docker run --name some-mysql -v /home/jcoelho/workspace/helpdesk/resource/db/:/var/lib/mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=4f8jm22l-o0okmne2 -d mysql:lates