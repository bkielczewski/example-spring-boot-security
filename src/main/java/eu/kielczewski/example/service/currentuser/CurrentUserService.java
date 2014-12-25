package eu.kielczewski.example.service.currentuser;

import eu.kielczewski.example.domain.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}
