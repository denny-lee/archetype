#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao.impl;

import ${package}.dao.BaseDao;
import ${package}.dao.GirlDao;
import ${package}.entity.GirlFriend;
import org.springframework.stereotype.Repository;

@Repository
public class GirlDaoImpl extends BaseDao<GirlFriend> implements GirlDao {
}
