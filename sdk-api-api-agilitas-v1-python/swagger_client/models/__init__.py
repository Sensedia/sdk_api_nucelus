# coding: utf-8

"""
    API Agillitas Cartões Pré-pagos

    API para manipular recursos relacionadas à cartões pré-pagos Agillitas.

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

# import models into model package
from .cadastro_benificiario import CadastroBenificiario
from .cartao_disponivel import CartaoDisponivel
from .detalhamento_extrato import DetalhamentoExtrato
from .endereco_portador import EnderecoPortador
from .extrato_response import ExtratoResponse
from .msg_erro import MsgErro
from .novo_cartao import NovoCartao
from .novo_cartao_portador import NovoCartaoPortador
from .novo_cartao_portador_contato import NovoCartaoPortadorContato
from .novo_cartao_portador_endereco import NovoCartaoPortadorEndereco
from .pagamento import Pagamento
from .portador import Portador
from .portador_response import PortadorResponse
from .saldo import Saldo
from .set_card_status import SetCardStatus
from .set_novo_cartao import SetNovoCartao
from .set_pagamento import SetPagamento
from .set_saldo import SetSaldo
from .set_saldo_valor import SetSaldoValor
from .set_transferencia import SetTransferencia
from .status_cartao_response import StatusCartaoResponse
from .transferencia import Transferencia
from .transferencia_cadastro_benificiario import TransferenciaCadastroBenificiario
from .valor import Valor
