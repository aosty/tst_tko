# Teste Tokio - transferência backend

# pre-execução
rodar os endpoints para popular correntista e taxas \
\
curl --location --request POST 'localhost:8084/taxa/adicionar' \
curl --location --request POST 'localhost:8084/correntista/adicionar'

# endpoint para agendamento
localhost:8084/agendamento/agendar [POST] \
{
    "destino" : "1234-56",
    "dataAgendamento" : "2025-02-05T00:00:00.000",
    "valor" : "1234.78"
}

# endpoint para obter agendamentos para um correntista
localhost:8084/agendamento/obter_agendamentos
