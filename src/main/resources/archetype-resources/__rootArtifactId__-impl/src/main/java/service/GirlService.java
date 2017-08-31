#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.entity.GirlFriend;

public interface GirlService {
    GirlFriend serve(GirlFriend girlFriend) throws Exception;
}
