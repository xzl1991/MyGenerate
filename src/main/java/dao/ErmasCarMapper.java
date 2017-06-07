package dao;

import entity.ErmasCar;
import entity.ErmasCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErmasCarMapper {
    int countByExample(ErmasCarExample example);

    int deleteByExample(ErmasCarExample example);

    int deleteByPrimaryKey(Long cardId);

    int insert(ErmasCar record);

    int insertSelective(ErmasCar record);

    List<ErmasCar> selectByExample(ErmasCarExample example);

    ErmasCar selectByPrimaryKey(Long cardId);

    int updateByExampleSelective(@Param("record") ErmasCar record, @Param("example") ErmasCarExample example);

    int updateByExample(@Param("record") ErmasCar record, @Param("example") ErmasCarExample example);

    int updateByPrimaryKeySelective(ErmasCar record);

    int updateByPrimaryKey(ErmasCar record);
}