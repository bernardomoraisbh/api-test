package api.test.enums;

import org.apache.commons.lang3.StringUtils;

import lombok.Getter;

@Getter
public enum EnumTestEncoding {

	ADM_CADASTRAR_GRUPOS_DE_MENUS("ADM_CADASTRAR_GRUPOS_DE_MENUS"),
	ADM_CADASTRAR_PERMISSÕES("ADM_CADASTRAR_PERMISSÕES"),
	ADM_CADASTRAR_SERVENTIA("ADM_CADASTRAR_SERVENTIA"),
	ADM_EDITAR_GRUPOS_DE_MENUS("ADM_EDITAR_GRUPOS_DE_MENUS"),
	ADM_EDITAR_PERMISSÕES("ADM_EDITAR_PERMISSÕES"),
	ADM_EXCLUIR_GRUPOS_DE_MENUS("ADM_EXCLUIR_GRUPOS_DE_MENUS"),
	ADM_EXCLUIR_PERMISSÕES("ADM_EXCLUIR_PERMISSÕES"),
	ADM_EXCLUIR_SERVENTIA("ADM_EXCLUIR_SERVENTIA"),
	ADM_LISTAR_TODAS_AS_SERVENTIAS("ADM_LISTAR_TODAS_AS_SERVENTIAS");
	
	final String nome;
	
	EnumTestEncoding(String nome) {
		this.nome = nome;
	}
	
	public static EnumTestEncoding recoveryEnumByCode(String codigo) {
		if (StringUtils.isBlank(codigo)) {
			return null;
		}
		
		for (EnumTestEncoding modeloCertidao : EnumTestEncoding.values())
			if (modeloCertidao.getNome().equals(codigo))
				return modeloCertidao;
		
		return null;
	}
}
