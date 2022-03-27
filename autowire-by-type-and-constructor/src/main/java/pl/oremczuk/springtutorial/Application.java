package pl.oremczuk.springtutorial;

public class Application {

	private UsersRepository usersRepository;
	private DictionaryRepository dictionaryRepository;

	public UsersRepository getUsersRepository() {
		return usersRepository;
	}

	public Application(UsersRepository usersRepository, DictionaryRepository dictionaryRepository) {
		super();
		this.usersRepository = usersRepository;
		this.dictionaryRepository = dictionaryRepository;
	}

	public void setUsersRepository(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}

	public DictionaryRepository getDictionaryRepository() {
		return dictionaryRepository;
	}

	public void setDictionaryRepository(DictionaryRepository dictionaryRepository) {
		this.dictionaryRepository = dictionaryRepository;
	}

}
