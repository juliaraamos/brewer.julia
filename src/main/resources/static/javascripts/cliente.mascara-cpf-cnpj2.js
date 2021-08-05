var Brewer = Brewer || {};

class MascaraCpfCnpj {

		constructor() {
			this.radioTipoPessoa = $('.js-radio-tipo-pessoa');
			this.labelCpfCnpj = $('[for=cpfCnpj]');
			this.inputCpfCnpj = $('#cpfCnpj');
		}

		init() {
			this.radioTipoPessoa.on('change', onTypePeopleChange.bind(this));
		}

	}

	function onTypePeopleChange(evento) {
		var tipoPessoaSelecionada = $(evento.currentTarget);

		this.labelCpfCnpj.text(tipoPessoaSelecionada.attr('data-documento'));
		this.inputCpfCnpj.mask(tipoPessoaSelecionada.attr('data-mascara'));
		this.inputCpfCnpj.removeAttr('disabled');
		this.inputCpfCnpj.val('');
	}

	return MaskCpfCnpj;

	}());

	$(function() {
		var mascaraCpfCnpj = new Brewer.MascaraCpfCnpj();
		mascaraCpfCnpj.init();
	});