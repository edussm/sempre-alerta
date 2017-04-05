# Sempre Alerta
Projeto utilizado em exemplos de aula da disciplina Tecnologias Para Aplicações WEB

* Alunos:
  * Aluno 1
  * Aluno 2

## Tema do Projeto
Um chefe escoteiro precisa, em todo encontro, fazer o controle de frequência dos escoteiros e anotar quesitos como utilização do uniforme, apresentação e participação.

Normalmente isto é realizado em um caderno de anotações, mas juntar todas as informações no final do ano é muito complicado. 

Portanto, deseja-se automatizar o processo de mensuração de resultados. Para isso será necessário ter uma aplicação web que:
* permita o cadastro dos escoteiros;
* permita o cadastro do calendário de atividades;
* permita a marcação dos itens avaliativos citados.

## Detalhes de Implementação
Neste tópico serão informados os softwares e frameworks, que foram utilizados e merecem destaque.
### Banco de Dados
* MySQL versão > 5.7
### Backend
* Spring (Boot, MVC, Data);
* Maven.
### Frontend
* AngularJS;
* Bootstrap;

## Instalação/Execução
### Requisitos
* JDK 1.8
* Cliente git

### Procedimento de Instalação e Execução (Linux/OSx)
1. Baiar o código fonte:
        
        git clone https://github.com/edussm/sempre-alerta.git
2. Acessar a pasta do projeto:

        cd sempre-alerta
3. Compilar e efetuar testes unitários
    
        ./mvnw test
4. Executar
    
        ./mvnw spring-boot:run
ou
    
        ./mvnw clean package
        java -jar target/sempre-alerta-1.0.0-SNAPSHOT.jar
5. Acessar a interface no endereço: http://localhost:8080
