package org.example.motorvong2_meddatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MotorvognRepository {
    @Autowired
    private JdbcTemplate db;
    public List<Bil> hentbiler(){
        String sql="SELECT * FROM Biler;";
        List<Bil> bils=db.query(sql,new BeanPropertyRowMapper<>(Bil.class));
        return bils;
    }
    public void add(Motorvogn motorvogn){
        String sql="INSERT INTO Motorvogn (eierPersonNr,eiersNavn,eiersAdresse,kjennetegn, bilMerke,biltype) VALUES"+
                "(?,?,?,?,?,?);";
        db.update(sql,motorvogn);
    }
    public List<Motorvogn> hentMotorvogn(){
        String sql="SELECT * FROM Motorvogn;";
        List<Motorvogn> motorvogn=db.query(sql,new BeanPropertyRowMapper<>(Motorvogn.class));
        return motorvogn;
    }
    public void slettAlle(){
        String sql="DELETE  FROM Motorvogn;";
        db.update(sql);
    }


}
