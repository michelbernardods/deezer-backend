
<h1 align="center">
   Deezer
</h1>


<h4 align="center">
  ☕ Code and coffee
</h4>

<h3 align="center">
  #java #springboot #apirest #api #eclipse #devtools #mvp #web #jpa #postgresql #deezer
</h3>

Linkedin : https://www.linkedin.com/in/michel-bernardo/

## 💻 Projeto

Criar uma página de busca onde podemos fazer consultas pelo nome do artista. 

Todas as consultas serão salvas no banco de dados para gerar estatísticas.

Para exibir esses registros, deverá ser criado uma API REST que retornara os seguintes campos no formato JSON:
  - Nome pesquisado;
  - Data e hora da pesquisa no formato 00/00/0000 00:00:00 (DD/MM/YYYY HH:MM:SS)

Funcionalidades desejadas:

Todas as informações serão obtidas pela API pública do Deezer: https://api.deezer.com/search/?q=linkinpark
- Deverá aparecer os nomes das músicas separados por álbum;
- Abrir página da músicas ao clicar em cima;
- Permitir ordenação por álbum e ranking;
- Página responsiva;
- Todos as buscas deverão ser salvar no banco de dados;

-> Backend : Java 
-> Frontend : PostgresSql


# Requisítos 

Para acessar o banco de dados, precisa instalar o Postgresql:
https://www.postgresql.org/download/

Para acessar o Front end precisa baixar o repositório: 
https://github.com/michelbernardods/deezer-frontend

##### OBS: Muito importante iniciar o backend antes do frontend!


# Iniciar o backend 

- Importar o arquivo .zip no Java.
- Run As -> Java Aplication.
- Iniciar o Postgresql com PgAdmin 

##### Se o seu Postgresql estiver rodando na porta 5432 você precisa mudar no arquivo ( aplication.properties )


#### Customize configuration
See [Configuration Reference](https://cli.vuejs.org/config/).
