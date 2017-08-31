#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.impl;

import ${package}.dao.GirlDao;
import ${package}.entity.GirlFriend;
import ${package}.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class GirlServiceImpl implements GirlService {
    @Autowired
    private GirlDao girlDao;
    @Override
    public GirlFriend serve(GirlFriend gf) throws Exception {

        girlDao.save(gf);

        return gf;
    }
}
