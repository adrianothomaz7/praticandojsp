/**
 * 
 */

function validar(){
	let nome = frmContato.nome.value
	let fone = frmContato.fone.value
	
	if(nome===""){
		alert("preencha o nome")
		frmContato.nome.focus();
		return false
	}else if(fone===""){
		alert("preencha o fone")
			frmContato.fone.focus()
			return false
		}else{
			document.forms["frmContato"].submit()
		}
	}