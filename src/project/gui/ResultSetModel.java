
package project.gui;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ResultSetModel extends AbstractTableModel {
    ArrayList<String []> dataRow = new ArrayList<String[]>();
    String [] columnName=new String[0];
    

    @Override
    public int getRowCount() {
      
        return dataRow.size();
    }

    @Override
    public int getColumnCount() {
        
        return columnName.length;
    }

    @Override
    public String getValueAt(int rowIndex, int columnIndex) {
       
        return dataRow.get(rowIndex)[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
       return columnName.length==0?"No row":columnName[column];
       
       
    }
    public void setResultSet(ResultSet rs) throws SQLException{
      ResultSetMetaData rsm=rs.getMetaData();
      int column =rsm.getColumnCount();
      columnName=new String[column];
      for(int i=0;i<column;i++){
      
          columnName[i]=rsm.getColumnName(i+1);
      }
      while(rs.next()){
          String[] row=new String[column];
          for(int i=0;i<column;i++){
              row[i]=rs.getString(i+1);
          }
          dataRow.add(row);
          fireTableChanged(null);
      }     
    
    }
}
