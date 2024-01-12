``` @RestController
@RequestMapping("/api/v1/users")
@Validated
public class UserController {
 
    private final UserService userService;
 
    public UserController(@Qualifier("userService") UserService userService) {
        this.userService = userService;
    }
 
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable String userId) {
        return return userService.getUser(userId)
                .map(user -> new ResponseEntity<>(new User(), HttpStatus.FOUND))
                .get();    
    }
}

@Service
public class UserService {
    public Optional<User> getUser(String userId) {
        return Optional.empty();
    }
}

public class User {
    @NotEmpty
    private String userId;
}

```
