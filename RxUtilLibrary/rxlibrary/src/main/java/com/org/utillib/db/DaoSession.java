package com.org.utillib.db;

import com.org.utillib.mode.AuthorModel;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import java.util.Map;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig authorModelDaoConfig;

    private final AuthorModelDao authorModelDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        authorModelDaoConfig = daoConfigMap.get(AuthorModelDao.class).clone();
        authorModelDaoConfig.initIdentityScope(type);

        authorModelDao = new AuthorModelDao(authorModelDaoConfig, this);

        registerDao(AuthorModel.class, authorModelDao);
    }
    
    public void clear() {
        authorModelDaoConfig.clearIdentityScope();
    }

    public AuthorModelDao getAuthorModelDao() {
        return authorModelDao;
    }

}
