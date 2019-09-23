import com.wells.lol.mapper.PieceMapper;
import com.wells.lol.pojo.Piece;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.*;


public class MybatisTest {

    SqlSession session = null;

    @Before
     public void initMybatis(){
        try (InputStream is = Resources.getResourceAsStream("mybatis-config.xml");){
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            session = factory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void closeSession(){
        if (session != null) {
            session.close();
        }
    }

    @Test
    public void testMybatis(){
        Piece piece = new Piece();
        piece.setArmor(10);//护甲
        piece.setResistance(20);//魔抗
        piece.setAttack(80);//攻击力
        piece.setMagic(20);//法术强度
        piece.setAttack_distance(890);//攻击距离
        piece.setAttack_speed(0.65f);//攻击速度
        piece.setCrit(25);//暴击率
        piece.setName("小炮4");
        piece.setNumber("Tristana4");

        PieceMapper mapper = session.getMapper(PieceMapper.class);

        Piece piece1 = new Piece();
        piece1.setName("小11炮");
        piece1.setArmor(6346);
//        List<Piece> allPiece1 = mapper.getPieceByName(piece1);
        List<Piece> allPiece = mapper.getAllPiece();
//        int i = mapper.updateName(piece1);
//        int i = mapper.insertPiece(piece);


        for (Piece p:allPiece
             ) {
            System.out.println(p.getName()+","+p.getNumber()+","+p.getArmor());
        }

        Piece piece2 = new Piece();
        piece2.setArmor(10);//护甲
        piece2.setResistance(20);//魔抗
        piece2.setAttack(80);//攻击力
        piece2.setMagic(20);//法术强度
        piece2.setAttack_distance(890);//攻击距离
        piece2.setAttack_speed(0.65f);//攻击速度
        piece2.setCrit(25);//暴击率
        piece2.setName("小炮2");
        piece2.setNumber("Tristana2");

        Piece piece3 = new Piece();
        piece3.setArmor(10);//护甲
        piece3.setResistance(20);//魔抗
        piece3.setAttack(80);//攻击力
        piece3.setMagic(20);//法术强度
        piece3.setAttack_distance(890);//攻击距离
        piece3.setAttack_speed(0.65f);//攻击速度
        piece3.setCrit(25);//暴击率
        piece3.setName("小炮3");
        piece3.setNumber("Tristana3");

        List<Piece> list = new ArrayList<>();
        list.add(piece);
        list.add(piece2);
        list.add(piece3);

//        mapper.insertPiece2(list);
//        session.commit();

        List<String> l = new ArrayList<>();
        l.add("1");
        l.add("2");
        l.add("4");
//        List<Piece> pieces = mapper.selectIn(l);
//        pieces.forEach(e -> System.out.println(e.getName()+","+e.getNumber()));
//        pieces.forEach(System.out::println);

        Map map = new HashMap();
        map.put("1","1");
        map.put("5","5");
//        List<Piece> pieces2 = mapper.selectMap(map);
//        pieces2.forEach(e -> System.out.println(e.getName()+","+e.getNumber()));

    }
}
