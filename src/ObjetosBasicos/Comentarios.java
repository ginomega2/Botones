
package ObjetosBasicos;

/**
 *
 * @version 3.0
 * @serial  12345
 * @author krsna
 * @implNote Notas para la implementacion por ejemplo: cuidado con esta implementacion borra archivos
 * @implSpec Aqui van anotadas  las especificciones del la implementacion parametros tipos devueltos etc
 * @apiNote esto espara la web
 * @deprecated esto es para marcar como en desuso
 * @since versio 2.4
 *
 */
public class Comentarios {

    String nombre;

    /**
     *
     * @return Esta funcion Imprimir,  Retorna un string con el nombre del creador de este objeto
     * @exception error_2024_No_Manches_Excpeption  parsaran errores si no usas bien el codigo
     * @throws functionErronea indica lo que lanzara cuando pasa el error
     * @since version 4
     * @implNote  Esta Implementacion es la mas simple de todas
     * @serialData 55sh7612
     */
    public String Imprimir(){
        nombre="KRSNA EMANUEL ROCHA";
        return nombre;
    }
}

