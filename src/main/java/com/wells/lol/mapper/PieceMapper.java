package com.wells.lol.mapper;

import com.wells.lol.pojo.Piece;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PieceMapper {
    public int insertPiece(Piece piece);

    public List<Piece> getAllPiece();


    public List<Piece> getPieceByName(Piece piece);


    public int updateName(Piece piece);
    public int insertPiece2(List<Piece> piece);
    public List<Piece> selectIn(List<String> numbers);
    public List<Piece> selectMap(@Param("myMap") Map<String,String> numbers);

}
