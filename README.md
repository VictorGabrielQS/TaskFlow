# 📝 TaskFlow — Gerenciador de Tarefas Inteligente

Este projeto é uma **aplicação Java Spring Boot** que desenvolvi para demonstrar **POO avançada, princípios de design e boas práticas de código**.
O objetivo é mostrar como estruturo uma aplicação de forma profissional, seguindo **SOLID, camadas separadas (Controller, Service, Repository), DTOs, mapeamento e testes de lógica de negócio**.

---

## 🔹 Sobre o projeto

O **TaskFlow** é um gerenciador de tarefas que permite criar, organizar e acompanhar atividades de diferentes categorias (como Trabalho, Estudo, Saúde).

Principais características:

* Cadastro de tarefas e usuários
* Diferentes tipos de tarefas usando **herança e polimorfismo**
* Controle de status e prioridade das tarefas
* Cálculo de produtividade dos usuários
* Envio de notificações via diferentes serviços (simulado)
* Camada de DTOs para comunicação segura entre Controller e Service
* Estrutura pronta para **extensões e integração com front-end**

---

## 🧩 Tecnologias utilizadas

* Java 17+
* Spring Boot
* Spring Data JPA
* H2 Database (para testes locais)
* Maven
* Lombok (para reduzir boilerplate)

---

## 🏗 Estrutura do projeto

```
com.victorgabriel.taskflow
│
├── model/          → Entidades e enums (POO avançada)
├── dto/            → Objetos de transferência de dados
├── repository/     → Acesso ao banco de dados (JPA)
├── service/        → Regras de negócio
├── controller/     → API REST
└── mapper/         → Conversão entre DTOs e Entidades
```

💡 Tudo estruturado pensando em **responsabilidade única**, **reutilização e legibilidade**.

---

## ⚡ Funcionalidades principais

1. Criar, listar, atualizar e deletar tarefas
2. Filtrar tarefas por usuário, status ou prioridade
3. Categorizar tarefas por tipo (Estudo, Saúde, Trabalho, etc.)
4. Calcular a produtividade de cada usuário (tarefas concluídas / total de tarefas)
5. Simular envio de notificações para tarefas importantes

---

## 💡 Conceitos de POO aplicados

* **Herança e polimorfismo:** subclasses de tarefas com comportamentos próprios
* **Encapsulamento:** atributos privados com getters/setters
* **Abstração e interfaces:** serviços de notificação flexíveis
* **SOLID:** cada classe e serviço tem **uma única responsabilidade**

---

## 🚀 Como rodar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/seuusuario/taskflow.git
```

2. Abra no IDE de sua preferência (IntelliJ, Eclipse, VS Code com extensão Java)

3. Execute como **Spring Boot Application**

4. Acesse a API local (ex.: `http://localhost:8080/tarefas`) usando Postman ou Insomnia

---

## 🎯 Próximos passos e melhorias

* Integração com front-end React ou Angular
* Upload de arquivos para anexar documentos às tarefas
* Implementação de autenticação JWT e perfis de usuário
* Notificações reais via email ou push

---

## 👨‍💻 Sobre mim

Oi, eu sou **Victor Gabriel**, desenvolvedor Java em formação, focado em **backend profissional** e em criar sistemas **bem estruturados, testáveis e escaláveis**.
Este projeto demonstra como aplico **POO avançada e princípios de design** em projetos reais.

---

## 📌 Contato

* GitHub: [https://github.com/seuusuario](https://github.com/seuusuario)
* LinkedIn: [https://linkedin.com/in/seuusuario](https://linkedin.com/in/seuusuario)

---

Se você quiser, posso criar **uma versão ainda mais chamativa**, com badges de tecnologias, status do build e imagens ilustrando a arquitetura, pronta para colar no seu GitHub.

Quer que eu faça isso?
Perfeito, Victor! Aqui está um modelo de **README humanizado** para o seu projeto **TaskFlow**, focado em mostrar **POO avançada, SOLID e boas práticas**, sem ser só técnico demais — quer impressionar recrutadores e clientes no GitHub:

---

# 📝 TaskFlow — Gerenciador de Tarefas Inteligente

### Olá, seja bem-vindo(a) ao meu portfólio! 👋

Este projeto é uma **aplicação Java Spring Boot** que desenvolvi para demonstrar **POO avançada, princípios de design e boas práticas de código**.
O objetivo é mostrar como estruturo uma aplicação de forma profissional, seguindo **SOLID, camadas separadas (Controller, Service, Repository), DTOs, mapeamento e testes de lógica de negócio**.

---

## 🔹 Sobre o projeto

O **TaskFlow** é um gerenciador de tarefas que permite criar, organizar e acompanhar atividades de diferentes categorias (como Trabalho, Estudo, Saúde).

Principais características:

* Cadastro de tarefas e usuários
* Diferentes tipos de tarefas usando **herança e polimorfismo**
* Controle de status e prioridade das tarefas
* Cálculo de produtividade dos usuários
* Envio de notificações via diferentes serviços (simulado)
* Camada de DTOs para comunicação segura entre Controller e Service
* Estrutura pronta para **extensões e integração com front-end**

---

## 🧩 Tecnologias utilizadas

* Java 17+
* Spring Boot
* Spring Data JPA
* H2 Database (para testes locais)
* Maven
* Lombok (para reduzir boilerplate)

---

## 🏗 Estrutura do projeto

```
com.victorgabriel.taskflow
│
├── model/          → Entidades e enums (POO avançada)
├── dto/            → Objetos de transferência de dados
├── repository/     → Acesso ao banco de dados (JPA)
├── service/        → Regras de negócio
├── controller/     → API REST
└── mapper/         → Conversão entre DTOs e Entidades
```

💡 Tudo estruturado pensando em **responsabilidade única**, **reutilização e legibilidade**.

---

## ⚡ Funcionalidades principais

1. Criar, listar, atualizar e deletar tarefas
2. Filtrar tarefas por usuário, status ou prioridade
3. Categorizar tarefas por tipo (Estudo, Saúde, Trabalho, etc.)
4. Calcular a produtividade de cada usuário (tarefas concluídas / total de tarefas)
5. Simular envio de notificações para tarefas importantes

---

## 💡 Conceitos de POO aplicados

* **Herança e polimorfismo:** subclasses de tarefas com comportamentos próprios
* **Encapsulamento:** atributos privados com getters/setters
* **Abstração e interfaces:** serviços de notificação flexíveis
* **SOLID:** cada classe e serviço tem **uma única responsabilidade**

---

## 🚀 Como rodar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/seuusuario/taskflow.git
```

2. Abra no IDE de sua preferência (IntelliJ, Eclipse, VS Code com extensão Java)

3. Execute como **Spring Boot Application**

4. Acesse a API local (ex.: `http://localhost:8080/tarefas`) usando Postman ou Insomnia

---

## 🎯 Próximos passos e melhorias

* Integração com front-end React ou Angular
* Upload de arquivos para anexar documentos às tarefas
* Implementação de autenticação JWT e perfis de usuário
* Notificações reais via email ou push

---

## 👨‍💻 Sobre mim

Oi, eu sou **Victor Gabriel**, desenvolvedor Java em formação, focado em **backend profissional** e em criar sistemas **bem estruturados, testáveis e escaláveis**.
Este projeto demonstra como aplico **POO avançada e princípios de design** em projetos reais.

---

## 📌 Contato

* GitHub: [https://github.com/seuusuario](https://github.com/VictorGabrielQS)
* LinkedIn: [https://linkedin.com/in/seuusuario](www.linkedin.com/in/victor-gabrielqs)

---

Se você quiser, posso criar **uma versão ainda mais chamativa**, com badges de tecnologias, status do build e imagens ilustrando a arquitetura, pronta para colar no seu GitHub.

Quer que eu faça isso?
