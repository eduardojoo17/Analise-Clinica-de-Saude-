# Clinica Sáude +

## Realizar Login

#### - Atores
- Paciente
- Atendente
- Médico

#### - Pré-condições:
- Conexão internet ativa 
- Realizar cadastro

#### - Pós-condições:
- Sessão iniciada
- Dados salvos no sistema

#### - Fluxo Pricincipal
- Usuario digita Login e Senha.
- Usuario seleciona o botão logar.
- O sistema valida as informações no banco de dados
- Validada as informações e a sessão se inicia.
- O sistema abre a pagina inicial.

#### - Fluxo alternativo
- Usuario digita senha invalida.
- O usuário solicita mudança de senha
- Redefine a senha
- E segue o fluxo Principal novamente.


## Agendamento

#### - Atores
- Paciente
- Atendente

#### - Pré-condições:
- Logado no sitema.
- Verificar opções médicas e horários disponiveis desejados.

#### - Pós-condições:
- Aguardar confirmação da atendente do agendamento.
- Dados salvos no sistema.
- Possibilidade de solicitar cancelamento.

#### - Fluxo Pricincipal
- Usuário seleciona campo de agendamento.
- Escolher a especialidade médica e horários disponiveis desejados.
- Aguardar confirmação de agendamento.
- Agendamento confirmado.

#### - Fluxo Alternativo
- Aguardar confirmação de agendamento.
- Agendamento não-confirmado(horario indisponivel)
- Refazer fluxo principal em outro horario.


## Cancelamento de consulta

#### - Atores
- Paciente
- Atendente

#### - Pré-condições:
- Agendamento realizado

#### - Pós-condições:
- Cancelamento confirmado
- Liberado a realizar outro agendamento 

#### - Fluxo Pricincipal
- Usuário seleciona campo de cancelamento.
- Escolher consulta para cancelamento.
- Cancelamento confirmado.

#### - Fluxo Alternativo
- Usuário seleciona o campo de cancelamento.
- Usuário escolhe a consulta a ser cancelada.
- O sistema verifica o horário e identifica que o prazo permitido para cancelamento foi excedido.
-O sistema exibe mensagem informando que não é mais possível cancelar a consulta, pois o prazo expirou.





