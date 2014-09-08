package com.octo.reactive.audit.javax.tools;

import com.octo.reactive.audit.AbstractFileAudit;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import static com.octo.reactive.audit.lib.Latency.LOW;

// Nb methods: 4
@Aspect
public class FileObjectAudit extends AbstractFileAudit
{
	@Before("call(* javax.tools.FileObject.delete())")
	public void delete(JoinPoint thisJoinPoint)
	{
		latency(LOW, thisJoinPoint);
	}

	@Before("call(* javax.tools.FileObject.openInputStream())")
	public void openInputStream(JoinPoint thisJoinPoint)
	{
		latency(LOW, thisJoinPoint);
	}

	@Before("call(* javax.tools.FileObject.openOutputStream())")
	public void openOutputStream(JoinPoint thisJoinPoint)
	{
		latency(LOW, thisJoinPoint);
	}

	@Before("call(* javax.tools.FileObject.openReader(boolean))")
	public void openReader(JoinPoint thisJoinPoint)
	{
		latency(LOW, thisJoinPoint);
	}

	@Before("call(* javax.tools.FileObject.openWriter())")
	public void openWriter(JoinPoint thisJoinPoint)
	{
		latency(LOW, thisJoinPoint);
	}

}