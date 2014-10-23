/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraktefabrik;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class HtmlTableFactory extends TableFactory {

    @Override
    public Table createTable() {
    
        return new HtmlTable();
    }

    @Override
    public Row createRow() {
    
        return new HtmlRow();
    }

    @Override
    public Cell createCell(String c) {
     
        return new HtmlCell(c);
    }
    
}
