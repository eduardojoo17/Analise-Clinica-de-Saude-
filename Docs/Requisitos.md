# 🩺 Portal do Paciente – Clínica Saúde+

## 📘 Documento de Requisitos do Sistema

### 1. Introdução

Este documento apresenta os **Requisitos Funcionais (RF)**, **Requisitos Não Funcionais (RNF)** e **Regras de Negócio (RN)** do sistema **Portal do Paciente**, desenvolvido para a **Clínica Saúde+**.  

---

### 1. Requisitos Funcionais (RF)

| Código | Descrição | Categoria | Usuário |
|:------:|------------|------------|----------|
| **RF01** | O sistema deve permitir acesso multiplataforma (web e mobile). | Funcionalidade principal | Cliente |
| **RF02** | O sistema deve permitir o cadastro de usuário com autenticação por e-mail e login com senha. | Cadastro | Cliente |
| **RF03** | O sistema deve exibir uma área com as especialidades médicas disponíveis. | Consulta de dados | Cliente |
| **RF04** | O sistema deve permitir visualizar os horários disponíveis de cada clínica e médico. | Consulta de agenda | Cliente |
| **RF05** | O sistema deve permitir que o paciente agende e cancele consultas online. | Agendamento | Cliente |
| **RF06** | O sistema deve enviar notificações e lembretes de consultas. | Comunicação | Cliente |
| **RF07** | O sistema deve permitir a atualização de dados pessoais do paciente. | Manutenção de dados | Cliente |
| **RF08** | O sistema deve permitir o cadastro de atendente com autenticação por e-mail e matrícula de contrato. | Cadastro administrativo | Atendente |
| **RF09** | O sistema deve permitir que a atendente visualize, gerencie e confirme agendamentos. | Gerenciamento de agenda | Atendente |
| **RF10** | O sistema deve exibir um painel com as consultas do dia. | Controle diário | Atendente |
| **RF11** | O sistema deve permitir que o médico visualize sua agenda de consultas. | Consulta de agenda | Médico |
| **RF12** | O sistema deve permitir que o médico atualize sua disponibilidade. | Configuração | Médico |
| **RF13** | O sistema deve exibir o histórico de pacientes atendidos. | Histórico clínico | Médico |

---

### 2. Requisitos Não Funcionais (RNF)

| Código | Descrição | Categoria |
|:------:|------------|------------|
| **RNF01** | O sistema deve garantir autenticação segura por e-mail e senha. | Segurança |
| **RNF02** | O sistema deve operar 24 horas por dia, 7 dias por semana. | Disponibilidade |
| **RNF03** | O sistema deve ter tempo de resposta inferior a 3 segundos para ações comuns (login, agendamento, consulta). | Desempenho |
| **RNF04** | O sistema deve ser acessível e responsivo para uso em dispositivos móveis e desktops. | Acessibilidade |
| **RNF05** | O sistema deve possuir interface intuitiva e de fácil navegação, com ícones e textos claros. | Usabilidade |

---

### 3. Regras de Negócio (RN)

| Código | Descrição |
|:------:|------------|
| **RN01** | Todo agendamento deve ser aprovado pela recepcionista antes de ser confirmado no sistema. |
| **RN02** | O paciente só pode cancelar uma consulta com no mínimo 24 horas de antecedência. |
| **RN03** | Um paciente não pode ter dois agendamentos ativos para a mesma especialidade no mesmo dia. |
| **RN04** | O médico deve manter sua disponibilidade atualizada para evitar conflitos de horários. |
| **RN05** | A confirmação de um agendamento bloqueia automaticamente o horário na agenda do médico. |

---

