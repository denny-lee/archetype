#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import ${package}.entity.GirlFriend;

public interface GirlDao {
    void save(GirlFriend girlFriend) throws Exception;
}
