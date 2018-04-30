package ulusofona.fuc.controllers.api;

import java.util.List;

import ulusofona.fuc.controllers.impl.entities.Fuc;

public interface IFucDAO extends IBaseDAO<Fuc> {

	List<Fuc> getAll();
}
