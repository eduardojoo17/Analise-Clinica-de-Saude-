<section>
  <h1>Estudo de Caso - Sistema de Agendamento Online (Clínica Saúde+)</h1>

  <h2>Requisitos Funcionais (RF)</h2>

  <h3>Cliente</h3>
  <ul>
    <li><strong>RF01</strong> – Acesso online multiplataforma (web e mobile) para pacientes.</li>
    <li><strong>RF02</strong> – Autoatendimento para agendar, cancelar e consultar horários 24/7.</li>
    <li><strong>RF03</strong> – Cadastro de usuário com autenticação (e-mail) e login por senha.</li>
    <li><strong>RF04</strong> – Exibição de especialidades disponíveis (área de especialidades).</li>
    <li><strong>RF05</strong> – Visualização dos horários disponíveis de cada clínica/médico.</li>
    <li><strong>RF06</strong> – Área de agendamento com possibilidade de cancelamento.</li>
    <li><strong>RF07</strong> – Envio de notificações e lembretes ao paciente (e-mail/SMS).</li>
    <li><strong>RF08</strong> – Atualização de dados pessoais pelo paciente (telefone, e-mail, endereço).</li>
  </ul>

  <h3>Atendente / Recepção</h3>
  <ul>
    <li><strong>RF09</strong> – Cadastro de atendente/administrador com autenticação (e-mail) e login por matrícula/contrato.</li>
    <li><strong>RF10</strong> – Fluxo para visualizar solicitações de agendamento pendentes e aprovar/reprovar (bloquear horário para o médico quando aprovado).</li>
    <li><strong>RF11</strong> – Gerenciamento de agenda com visualização de horários vagos, agendados, bloqueios e encaixes.</li>
    <li><strong>RF12</strong> – Painel de consultas do dia (lista cronológica por médico/horário com status).</li>
  </ul>

  <h3>Médico</h3>
  <ul>
    <li><strong>RF13</strong> – Acesso online à própria agenda de consultas (visualização por dia/semana).</li>
    <li><strong>RF14</strong> – Possibilidade de atualizar a própria disponibilidade (marcar indisponibilidade/ferias/bloqueios).</li>
    <li><strong>RF15</strong> – Visualização do histórico de pacientes (consultas anteriores associadas ao paciente).</li>
  </ul>

  <h2>Requisitos Não Funcionais (RNF)</h2>
  <ul>
    <li><strong>RNF01</strong> – Segurança e autenticação: criptografia de senhas, controle de acesso por perfil e proteção dos dados pessoais e médicos.</li>
    <li><strong>RNF02</strong> – Desempenho: respostas às ações do usuário (busca, login, agendamento) em até 3 segundos em condições normais.</li>
    <li><strong>RNF03</strong> – Acessibilidade e responsividade: interface compatível e usável em computadores, tablets e smartphones.</li>
    <li><strong>RNF04</strong> – Disponibilidade: sistema disponível 24/7, com janelas de manutenção agendadas. (correção: este item é não funcional, antes estava como RF)</li>
    <li><strong>RNF05</strong> – Usabilidade e intuitividade: interface simples e clara para públicos diversos (pacientes jovens e adultos, recepcionistas, médicos).</li>
  </ul>

  <h2>Regras de Negócio (RN)</h2>
  <ul>
    <li><strong>RN01</strong> – Todo agendamento feito pelo paciente fica como <em>pendente</em> e só se torna definitivo após aprovação da recepcionista (fluxo de confirmação para evitar duplicidade).</li>
    <li><strong>RN02</strong> – Cancelamento: paciente só pode cancelar uma consulta respeitando a antecedência mínima definida pela clínica (ex.: 24 horas).</li>
    <li><strong>RN03</strong> – Um paciente não pode ter dois agendamentos ativos para a mesma especialidade no mesmo dia (validação automática).</li>
  </ul>

  <hr/>
  <p><em>Observação:</em> Reclassifiquei “o sistema tem que funcionar 24h/7” como <strong>RNF04 – Disponibilidade</strong> porque trata de uma qualidade do sistema (não é uma função que o usuário executa). Também separei claramente o fluxo de aprovação (RF10) da regra de negócio que exige aprovação (RN01).</p>
</section>