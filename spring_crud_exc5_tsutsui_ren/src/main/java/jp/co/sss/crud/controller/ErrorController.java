package jp.co.sss.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

	@GetMapping("/error")
	public String handleError(HttpServletRequest request, Model model) {
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		Object message = request.getAttribute(RequestDispatcher.ERROR_MESSAGE);

		model.addAttribute("status", status != null ? status.toString() : "不明");
		model.addAttribute("error", message != null ? message.toString() : "エラーが発生しました");

		return "error/error";
	}
}