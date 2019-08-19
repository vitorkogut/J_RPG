package combate;


public class TextosCombate {
    
    private String returnTxt;
    
    private String acertoGue = "Você acerta um golpe de espada retirando 10 de vida.";
    private String acertoMago = "Você acerta uma Soul Arrow retirando 10 de vida.";
    private String acertoArq = "Você acerta um disparo retirando 10 de vida.";
    
    private String acertoCritico= "Seu ataque acertou em cheio o inimigo causando dano em dobro.";
    
    private String erro = "Seu ataque é falho.";
    private String erroCritico = "Você erra seu ataque e em seguida perde o equilibrio ( -1 round ).";
    
    private String vitória = "Após esse golpe o inimigo cai em dor.";
    
     public String getTextoCombate(int num){
         
        switch(num){
        
            case 0:
                returnTxt = acertoGue;
            break;
            
            case 1:
                returnTxt = acertoMago;
            break;
            
            case 2:
                returnTxt = acertoArq;
            break;
            
            case 3:
                returnTxt = acertoCritico;
            break;
            
            case 4:
                returnTxt = erro;
            break;
            
            case 5:
                returnTxt = erroCritico;
            break;
            
            case 6:
                returnTxt = vitória;
            break;

        }
        
        return returnTxt;
    
    
     }
}



