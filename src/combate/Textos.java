/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combate;

/**
 *
 * @author Gustavo
 */
public class Textos {
    
    // AKI SE CONSEGUIREM FAZER COM LISTA FICARIA MELHOR
    
    private String returnTxt;
    
    private String txt0 = "O personagem ao voltar de Flosd encontra sua casa pegando fogo, desesperado entra na casa para tentar salvar sua familia, tudo o que vê lá dentro são 3 corpos carbonizados, concluindo então que seus pais e seu irmão estão mortos. ";
    private String txt1 = "Antes de sair da sua casa para não morrer, ele encontra 3 sacolas estranhas em um compartimento secreto escondido em baixo do piso, com pouco tempo e muito desespero, ele só conseguirá pegar uma das três sacolas, observou rapidamente alguns detalhes curiosos nas sacolas";
    private String txt2 = "1 - Sacola com ilustração de espada \n2 - Sacola com ilustração de um livro\n3 - Sacola com ilustração de um arco";
    private String txt3 = "Ao abrir a sacola, ele observa que havia uma um pequeno cubo no qual se transforma em uma grande espada magicamente ao toca-lo .";
    private String txt4 = "Ao abrir a sacola, ele observa que havia um livro em e mais um cubo que ao toca-lo , transforma-se em um cajado.";
    private String txt5 = "Ao abrir a sacola, ele observa que havia uma um pequeno cubo no qual se transforma em um grnde arco magicamente ao tocá-lo .";
    private String txt6 = "Junto de seu equipamento , havia um bilhete *INSIRA UM BACKGROUND PARA A SACOLAS AQUI*";
    
    public String getTxt( int n) {
        switch(n){
            case 0:
                returnTxt = txt0;
            break;
            
            case 1:
                returnTxt = txt1;
            break;
            
            case 2:
                returnTxt = txt2;
            break;
            
            case 3:
                returnTxt = txt3;
            break;
            
            case 4:
                returnTxt = txt4;
            break;
            
            case 5:
                returnTxt = txt5;
            break;
            
            case 6:
                returnTxt = txt6;
            break;
            
        }
        return returnTxt;       
    }

    
    
}
