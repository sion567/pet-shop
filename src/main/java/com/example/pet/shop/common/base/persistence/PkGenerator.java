package com.example.pet.shop.common.base.persistence;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;

import java.io.Serializable;
import java.util.Properties;
import java.util.stream.Stream;

/*
   @Id
    @GeneratedValue(generator = "prod-generator")
    @GenericGenerator(name = "prod-generator",
      parameters = @Parameter(name = "prefix", value = "prod"),
      strategy = "com.example.pet.shop.common.base.persistence.PkGenerator")
    private String prodId;
 */

public class PkGenerator implements IdentifierGenerator, Configurable {

    private String prefix;

    @Override
    public Serializable generate(
            SharedSessionContractImplementor session, Object obj)
            throws HibernateException {

        String query = String.format("select %s from %s",
                session.getEntityPersister(obj.getClass().getName(), obj)
                        .getIdentifierPropertyName(),
                obj.getClass().getSimpleName());

        Stream ids = session.createQuery(query).stream();
        Long max = 0l;
//        max = ids.map(o -> o.replace(prefix + "-", ""))
//                .mapToLong(Long::parseLong)
//                .max()
//                .orElse(0L);

        return prefix + "-" + (max + 1);
    }

    @Override
    public void configure(Type type, Properties properties,
                          ServiceRegistry serviceRegistry) throws MappingException {
        prefix = properties.getProperty("prefix");
    }
}
