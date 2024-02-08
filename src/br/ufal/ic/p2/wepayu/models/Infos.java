package br.ufal.ic.p2.wepayu.models;
import java.util.HashMap;
import java.util.Map;

import br.ufal.ic.p2.wepayu.Exception.AtributoNaoPreenchidoException;


public class Infos {
	private final Map<String, String> atributos = new HashMap<>();
	
	public void setAtributo(String chave, String valor) {
		this.atributos.put(chave,valor);
	}
	
	public String getAtributo(String chave) throws AtributoNaoPreenchidoException {
		if(this.atributos.containsKey(chave)) {
			return this.atributos.get(chave);
		}
		else {
			throw new AtributoNaoPreenchidoException();
		}
	}
	
	public Map<String, String> getAtributos() {
		return this.atributos;
	}
}