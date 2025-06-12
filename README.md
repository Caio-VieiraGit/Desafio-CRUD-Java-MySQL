# Desafio-CRUD-Java-MySQL

# 🛕 Sistema de Gerenciamento de Templos e Santuários – Cavaleiros do Zodíaco: Eliseos

Projeto desenvolvido como parte do curso **Técnico em Desenvolvimento de Sistemas – SENAI**, com o objetivo de construir um sistema CRUD completo em Java com banco de dados MySQL hospedado na plataforma Aiven.

## 👥 Desenvolvedores
- **Caio Vieira**
- **Leoni**

## 📌 Tema
**Templos e Santuários**

Sistema responsável por registrar e gerenciar informações dos templos sagrados, suas ordens protetoras, guardiões lendários, artefatos místicos e registros históricos ligados ao universo místico dos Cavaleiros do Zodíaco – Eliseos.

---

## 🛠 Tecnologias Utilizadas
- Java (JDK 17+)
- JDBC (conexão com banco)
- MySQL (Aiven)
- MySQL Workbench
- Git e GitHub
- IDE: IntelliJ

---

## 🗃 Estrutura do Banco de Dados

**Nome do banco:** `cdz_eliseos_dupla4`

**Tabelas implementadas:**
- `Templos`
- `Ordens`
- `Guardioes`
- `Artefatos`
- `Historicos_Templo`

---

## ✅ Funcionalidades
- Cadastrar templos, ordens, guardiões, artefatos e históricos
- Listar registros de cada tabela
- Editar registros
- Excluir registros
- Interface via linha de comando (CLI)
- Conexão ao banco Aiven via JDBC

---

## 📂 Estrutura do Projeto Java

 Pasta principal do projeto: `cdz-eliseos-templos-santuarios`

### Principais pacotes e arquivos implementados:

src/controller/ – Lógica de controle:

- TemploController.java
- GuardiaoController.java
- ArtefatoController.java
- OrdemController.java
- HistoricoTemploController.java

src/dao/ – Acesso ao banco de dados (DAO):

- TemploDAO.java
- GuardiaoDAO.java
- ArtefatoDAO.java
- OrdemDAO.java
- HistoricoTemploDAO.java

src/model/ – Classes de modelo (entidades):

- Templo.java
- Guardiao.java
- Artefato.java
- Ordem.java
- HistoricoTemplo.java

src/util/ – Utilitários:

- ConnectionFactory.java
  
src/view/ – Interface de linha de comando (menus):

- MenuPrincipal.java
- MenuTemplo.java
- MenuGuardiao.java
- MenuArtefato.java
- MenuOrdem.java
- MenuHistoricoTemplo.java

sql/ – Scripts SQL:

- create_database.sql
- insert_test_data.sql


---

## 📄 Licença
Uso didático – projeto acadêmico.

---

## 🙏 Agradecimentos
Agradecimentos ao SENAI e ao educador Marcio Oliveira da Silva Costa pelo desafio proposto.

