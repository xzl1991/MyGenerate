package dao;

import entity.ErmasCaseMain;
import entity.ErmasCaseMainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErmasCaseMainMapper {
    int countByExample(ErmasCaseMainExample example);

    int deleteByExample(ErmasCaseMainExample example);

    int deleteByPrimaryKey(Long acctNbr);

    int insert(ErmasCaseMain record);

    int insertSelective(ErmasCaseMain record);

    List<ErmasCaseMain> selectByExample(ErmasCaseMainExample example);

    ErmasCaseMain selectByPrimaryKey(Long acctNbr);

    int updateByExampleSelective(@Param("record") ErmasCaseMain record, @Param("example") ErmasCaseMainExample example);

    int updateByExample(@Param("record") ErmasCaseMain record, @Param("example") ErmasCaseMainExample example);

    int updateByPrimaryKeySelective(ErmasCaseMain record);

    int updateByPrimaryKey(ErmasCaseMain record);
}