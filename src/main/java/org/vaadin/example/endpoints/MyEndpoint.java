package org.vaadin.example.endpoints;

import java.util.Collections;
import java.util.List;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.BrowserCallable;
import dev.hilla.Nullable;
import dev.hilla.crud.CountService;
import dev.hilla.crud.CrudService;
import dev.hilla.crud.filter.Filter;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@BrowserCallable
@Service
@AnonymousAllowed
public class MyEndpoint implements CrudService<MyEntity, Long>, CountService {
    @Override
    public long count(@Nullable Filter filter) {
        return 0;
    }

    @Override
    public @Nullable MyEntity save(MyEntity value) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public MyEntity get(Long aLong) {
        return null;
    }

    @Override
    public List<MyEntity> list(Pageable pageable, @Nullable Filter filter) {
        return Collections.emptyList();
    }
}
