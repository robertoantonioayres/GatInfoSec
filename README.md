<h1>Projeto Desafio GAT</h1>
  
<h2> Sobre o desafio</h2>
  <p>
    O desafio consiste em uma série de requisitos que visam controlar a caixa de e-mail do gmail e organizar em 2 filas do Trello, sendo "E-mails lidos" e "E-mails não lidos".
  </p>  

</br>

<h2> Requisitos</h2>
  <p>
    Para conclusão do desafio, os seguintes requisitos foram levantados:
    <p><li> Manter monitoramento da caixa de entrada do gmail</p>
    <p><li> Manter logs de monitoramento</p>
    <p><li> Criar card trello a partir de e-mail da caixa de entrada</p>
    <p><li> Manter logs de movimentação de e-mail e cards trello</p>
    <p><li> Permitir consultar histórico de logs</p>
  </p>

</br>

<h2> Dependências do Projeto</h2>
<p><li> Spring Boot 2.6.0</p>
<p><li> Spring Data JPA</p>
<p><li> Java 8</p>
<p><li> PostgreSQL 10.19 ou superior</p>

</br>

<h2>API</h2>
<p>Os seguintes endpoints estão disponiveis para consumo através do método GET:</p>
<p>=> http://localhost:8082/desafio/card </p>
<p>=> http://localhost:8082/desafio/email </p>
<p>=> http://localhost:8082/desafio/monitoramento</p>
<p>=> http://localhost:8082/desafio/log</p>

<p>Histórico de logs disponível via <strong> Swagger</strong> no endpoint <strong> http://localhost:8082/desafio/historico </strong></p>

</br>

<h2>Base de dados</h2>

<p><strong>Link para acesso ao DER:</strong> https://drive.google.com/file/d/1we1z2HjT_LzPfevvVKsJbXe2Z7tTPLLq/view?usp=sharing </p>
<p><strong>Propriedades de conexão:</strong> Conexão de dados e parametros de conexão estão disponíveis no arquivo "application.properties"</p>
