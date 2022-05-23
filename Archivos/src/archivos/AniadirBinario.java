/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author marta
 */
public class AniadirBinario extends ObjectOutputStream{

    public AniadirBinario(OutputStream out) throws IOException {
        super(out);
    }

    public AniadirBinario() throws IOException, SecurityException {
    }
    
    @Override
    public void writeStreamHeader() throws IOException {
        reset();
    }
}
