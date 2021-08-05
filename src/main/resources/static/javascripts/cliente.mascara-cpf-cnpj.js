var Brewer = Brewer || {};

Brewer.MascaraCpfCnpj = (function(){

	function MascaraCpfCnpj() {
		this.radioTipoPessoa = $('.js-radio-tipo-pessoa');
		this.labelCpfCnpj = $('[for=cpf-cnpj]');
		this.inputCpfCnpj = $('#cpf-cnpj');
	}
	
	MascaraCpfCnpj.prototype.iniciar = function() {
		this.radioTipoPessoa.on('change', onTipoPessoaAlterado.bind(this));
	}
	
	function onTipoPessoaAlterado(evento){
		var tipoPessoaSelecionada = $(evento.currentTarget); 
		
		console.log(tipoPessoaSelecionada.attr('data-documento'));
		console.log(tipoPessoaSelecionada.attr('data-mascara'));
		
		this.labelCpfCnpj.text(tipoPessoaSelecionada.attr('data-documento'));
		this.inputCpfCnpj.mask(tipoPessoaSelecionada.attr('data-mascara'));
		this.inputCpfCnpj.val('');
		this.inputCpfCnpj.removeAttr('disabled');
	}
	
	return MascaraCpfCnpj;
}());

$(function(){
	var mascaraCpfCnpj = new Brewer.MascaraCpfCnpj();
	mascaraCpfCnpj.iniciar();
});