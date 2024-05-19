package za.ac.cput.service;

public interface iService <T, ID>
{
    T create(T t);
    T read(ID id);
    T update(T t);
}
